package com.kimmy.mapstruct.mapper;

import com.kimmy.mapstruct.model.SimpleDest;
import com.kimmy.mapstruct.model.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleStuffMapper {
    SimpleDest toSimpleDest(SimpleSource source);
    SimpleSource toSimpleSource(SimpleDest simpleDest);
}
