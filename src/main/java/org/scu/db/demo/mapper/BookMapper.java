package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Book;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> queryBook();
    List<Map> query_call_and_count();
}
