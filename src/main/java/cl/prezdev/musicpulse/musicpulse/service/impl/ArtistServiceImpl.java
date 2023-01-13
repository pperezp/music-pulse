package cl.prezdev.musicpulse.musicpulse.service.impl;

import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.dto.SocialMediaDto;
import cl.prezdev.musicpulse.musicpulse.model.Artist;
import cl.prezdev.musicpulse.musicpulse.model.ArtistContactInfo;
import cl.prezdev.musicpulse.musicpulse.model.ArtistSocialMedia;
import cl.prezdev.musicpulse.musicpulse.model.SocialMedia;
import cl.prezdev.musicpulse.musicpulse.repository.ArtistRepository;
import cl.prezdev.musicpulse.musicpulse.service.ArtistService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ModelMapper modelMapper;
    private final ArtistRepository artistRepository;

    @Override
    public Optional<ArtistDto> getArtistBy(long artistId) {
        Optional<Artist> optionalArtist = artistRepository.findById(artistId);

        if (optionalArtist.isEmpty()) {
            return Optional.empty();
        }

        Artist artist = optionalArtist.get();

        ArtistDto artistDto = modelMapper.map(artist, ArtistDto.class);

        artistDto.setEmails(getEmails(artist));
        artistDto.setSocialMedia(getSocialMedia(artist));

        return Optional.of(artistDto);
    }

    @Override
    public List<String> getEmails(Artist artist) {
        List<String> emails = new ArrayList<>();

        List<ArtistContactInfo> contactInfos = artist.getContactInfos();
        contactInfos.forEach(artistContactInfo -> emails.add(artistContactInfo.getEmail()));

        return emails;
    }

    @Override
    public List<SocialMediaDto> getSocialMedia(Artist artist) {
        List<SocialMediaDto> socialMediaDtoList = new ArrayList<>();

        List<ArtistSocialMedia> socialsMedia = artist.getSocialsMedia();

        socialsMedia.forEach(artistSocialMedia -> {
            SocialMediaDto socialMediaDto = modelMapper.map(artistSocialMedia, SocialMediaDto.class);

            SocialMedia socialMedia = artistSocialMedia.getSocialMedia();
            socialMediaDto.setIcon(socialMedia.getIconUrl());

            socialMediaDtoList.add(socialMediaDto);
        });

        return socialMediaDtoList;
    }
}
