package com.ag04.utils;

/**
 *  @author ndapic
 *
 */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
