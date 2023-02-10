package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.adapter;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Artist;
import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository.ArtistRepository;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ArtistMySqlAdapterTest {

    @InjectMocks
    private ArtistMySqlAdapter artistMySqlAdapter;

    @Mock
    private ArtistRepository artistRepository;

    @Mock
    private ModelMapper modelMapper;

    @BeforeEach
    void beforeEach(){
        List<Artist> artists = new ArrayList<>();

        Artist artist = new Artist();

        artist.setId(1l);
        artist.setName("name");
        artist.setImageUrl("image");

        artists.add(artist);

        ArtistDto artistDto = new ArtistDto();

        artistDto.setId(artist.getId());
        artistDto.setName(artist.getName());
        artistDto.setImageUrl(artist.getImageUrl());

        when(artistRepository.findAllByNameContains(anyString())).thenReturn(artists);
        when(modelMapper.map(artist, ArtistDto.class)).thenReturn(artistDto);
    }

    @Test
    void test(){
        List<ArtistLiteDto> artists = artistMySqlAdapter.search("name");

        assertNotNull(artists);
        assertFalse(artists.isEmpty());

        ArtistLiteDto artistDto = artists.get(0);

        assertNotNull(artistDto.getId());
        assertNotNull(artistDto.getName());
        assertNotNull(artistDto.getImageUrl());
    }
}