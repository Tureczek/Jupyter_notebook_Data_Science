package com.neo4j.javaandneo4j.accessingNeo4jData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Map;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Movie findByTitle(String title){
        Movie result = movieRepository.findByTitle(title);

        return result;
    }

    @Transactional(readOnly = true)
    public Collection<Movie> findByTitleLike(String title){
        Collection<Movie> result = movieRepository.findByTitleLike(title);

        return result;
    }
    /*
    @Transactional(readOnly = true)
    public Map<String, Object>  graph(int limit) {
        Collection<Movie> result = movieRepository.graph(limit);      return toD3Format(result);
    }   private Map<String, Object> toD3Format(Collection<Movie> movies) {
      ....
    }   private Map<String, Object> map(String key1, Object value1, String key2, Object value2) {
      ....
    } */
}