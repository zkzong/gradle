package com.zkzong.sbia.ch04.unsecured;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Zong on 2017/3/24.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
