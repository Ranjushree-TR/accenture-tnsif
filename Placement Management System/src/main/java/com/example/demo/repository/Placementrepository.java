package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Placement;

public interface Placementrepository extends JpaRepository<Placement , Long>
{

}