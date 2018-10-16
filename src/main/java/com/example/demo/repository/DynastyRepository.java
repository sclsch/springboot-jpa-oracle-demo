package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Dynasty;

public interface DynastyRepository extends JpaRepository<Dynasty, Long> {
}