package com.ken.infinity.repository;

import com.ken.infinity.models.Artwork;
import com.ken.infinity.models.User;

import java.util.List;

public interface ArtworkRepository {
    public List<Artwork> getArtworks();
    public List<Artwork> findAllArtworks();
    public void save(Artwork artwork);
    public Artwork findArtworkById(int id);
    public List<Artwork> findArtworkByOwner(int id);
    public void updateArtwork(Artwork artwork);
}
