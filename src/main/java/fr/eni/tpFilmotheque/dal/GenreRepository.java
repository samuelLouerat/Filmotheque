package fr.eni.tpFilmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tpFilmotheque.bo.Genre;




public interface GenreRepository  extends JpaRepository<Genre, Integer>{

}
