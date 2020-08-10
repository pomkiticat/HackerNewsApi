package com.example.hackernews.repository;

import com.example.hackernews.dto.ItemsDTO;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class ItemsRepository {
    Session session=null;

    public List<ItemsDTO> getStoryList(String type) throws Exception{
        String sql ="SELECT b from ItemsDTO b where b.type=:type order by b.score" ;

        Query query = session.createQuery(sql);
        query.setParameter("type",type);
        query.setFirstResult(1);
        query.setMaxResults(10);
        List<ItemsDTO> result =(List<ItemsDTO>) query.getResultList();
        return result;
    }

    public List<ItemsDTO> getCommandsList() throws Exception{
        String sql="";
        Query query = session.createQuery(sql);
        List<ItemsDTO> result =(List<ItemsDTO>) query.getResultList();
        return result;
    }
}
