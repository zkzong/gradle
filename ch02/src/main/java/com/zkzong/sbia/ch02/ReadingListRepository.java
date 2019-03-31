package com.zkzong.sbia.ch02;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Zong on 2017/1/7.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
