package com.web.web.v1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoDto {

    Long id;

    String number;

    String number2;

    ImageDto logo;

    ImageDto headerImg;

    ImageDto logoVk;

    ImageDto logoInstagram;

    ImageDto logoTwitter;

    ImageDto logoFacebook;

    ImageDto logoTelegram;

    String urlVk;

    String urlInstagram;

    String urlTwitter;

    String urlFacebook;

    String urlTelegram;

    String description;
}
