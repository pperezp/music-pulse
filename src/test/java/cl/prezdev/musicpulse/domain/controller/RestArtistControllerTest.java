package cl.prezdev.musicpulse.domain.controller;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistSearchResponse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RestArtistControllerTest {

    @InjectMocks
    private RestArtistController restArtistController;

    @Test
    void test_formatResponse(){
        ResponseEntity<ArtistSearchResponse> response = restArtistController.search("koke");
        HttpStatusCode httpStatusCode = response.getStatusCode();

        assert(httpStatusCode.is2xxSuccessful());

        ArtistSearchResponse body = response.getBody();
        assertNotNull(body);

        List<ArtistDto> artists = body.getArtists();
        assertNotNull(artists);

        assertFalse(artists.isEmpty());

        ArtistDto artistDto = artists.get(0);

        assertNotNull(artistDto.getId());
        assertNotNull(artistDto.getName());
        assertNotNull(artistDto.getImageUrl());
        assertNull(artistDto.getCountry());
        assertNull(artistDto.getContactsInfo());
        assertNull(artistDto.getSocialsMedia());
    }
}
