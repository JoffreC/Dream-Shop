package com.dailycodework.dream_shops.dto;


import java.util.Objects;

public class ImageDto {
    private Long id;
    private String imageName;
    private String downloadUrl;

    public ImageDto(Long id, String imageName, String downloadUrl) {
        this.id = id;
        this.imageName = imageName;
        this.downloadUrl = downloadUrl;
    }

    public ImageDto() {}

    @Override
    public String toString() {
        return "ImageDto{" +
                "id=" + id +
                ", imageName='" + imageName + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageDto imageDto = (ImageDto) o;
        return Objects.equals(id, imageDto.id) && Objects.equals(imageName, imageDto.imageName) && Objects.equals(downloadUrl, imageDto.downloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageName, downloadUrl);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
