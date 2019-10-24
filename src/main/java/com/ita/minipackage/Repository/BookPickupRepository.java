package com.ita.minipackage.Repository;

import com.ita.minipackage.Entity.BookPickup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPickupRepository extends JpaRepository<BookPickup, Integer> {

    @Query("Select bp from BookPickup bp where bp.packageNumber = :packageNumber")
    BookPickup findbyPackageNumber(@Param("packageNumber") Integer packageNumber);
}
