package cl.prezdev.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArtistServiceImplTest {

    @InjectMocks
    private ArtistServiceImpl artistService;

    @Test
    void test_searchArtistFormat(){
        List<ArtistDto> artists = artistService.search("koke");

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