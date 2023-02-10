package cl.prezdev.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.adapter.ArtistMySqlAdapter;
import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ArtistServiceImplTest {

    @InjectMocks
    private ArtistServiceImpl artistService;

    @Mock
    private ArtistMySqlAdapter artistMySqlAdapter;

    @BeforeEach
    void beforeEach(){
        List<ArtistLiteDto> artistDtoList = new ArrayList<>();

        ArtistLiteDto artistDto = new ArtistLiteDto();

        artistDto.setId(1L);
        artistDto.setName("name");
        artistDto.setImageUrl("image");

        artistDtoList.add(artistDto);

        when(artistMySqlAdapter.search(anyString())).thenReturn(artistDtoList);
    }

    @Test
    void test_searchArtistFormat(){
        List<ArtistLiteDto> artists = artistService.search("name");

        assertNotNull(artists);
        assertFalse(artists.isEmpty());

        ArtistLiteDto artistDto = artists.get(0);

        assertNotNull(artistDto.getId());
        assertNotNull(artistDto.getName());
        assertNotNull(artistDto.getImageUrl());
    }

}