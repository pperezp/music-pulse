package cl.prezdev.musicpulse.domain.controller;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistSearchResponse;

import cl.prezdev.musicpulse.domain.service.impl.ArtistServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RestArtistControllerTest {

    @InjectMocks
    private RestArtistController restArtistController;

    @Mock
    private ArtistServiceImpl artistService;

    @BeforeEach
    void beforeEach(){
        List<ArtistLiteDto> artists = new ArrayList<>();

        ArtistLiteDto artistDto = new ArtistLiteDto();

        artistDto.setId(1L);
        artistDto.setName("name");
        artistDto.setImageUrl("image");

        artists.add(artistDto);
        when(artistService.search(anyString())).thenReturn(artists);
    }

    @Test
    void test_formatResponse(){
        ResponseEntity<ArtistSearchResponse> response = restArtistController.search("koke");
        HttpStatusCode httpStatusCode = response.getStatusCode();

        assert(httpStatusCode.is2xxSuccessful());

        ArtistSearchResponse body = response.getBody();
        assertNotNull(body);

        List<ArtistLiteDto> artists = body.getArtists();
        assertNotNull(artists);

        assertFalse(artists.isEmpty());

        ArtistLiteDto artistDto = artists.get(0);

        assertNotNull(artistDto.getId());
        assertNotNull(artistDto.getName());
        assertNotNull(artistDto.getImageUrl());
    }
}
