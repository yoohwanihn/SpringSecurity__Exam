package com.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Optional<Member> findUserByMemberName(String memberName);
}