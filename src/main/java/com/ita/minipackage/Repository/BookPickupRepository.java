package com.ita.minipackage.Repository;

import com.ita.minipackage.Entity.BookPickup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPickupRepository extends JpaRepository<BookPickup, Integer> {

}
