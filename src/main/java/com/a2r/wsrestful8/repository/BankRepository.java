package com.a2r.wsrestful8.repository;

import com.a2r.wsrestful8.model.Banque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Banque,Long> {}