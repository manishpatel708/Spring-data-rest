package com.manektech.springDataRest.repo;

import com.manektech.springDataRest.entity.Ad;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ADRepository extends PagingAndSortingRepository<Ad, Long> {
}
