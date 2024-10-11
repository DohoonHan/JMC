package com.jmc.entity;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.NonNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Table
@Entity
public class CommunityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long com_id;
    // User 추가 예정
    // recommendations 추가 예정
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "contents", nullable = false)
    private String contents;

    @Column(name = "views")
    private Long views;

    @Column(name = "recommendations")
    private Long recommendations;

    @Column(name = "hastag")
    private String hasTag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "delete_time")
    private Date deleteTime;

    @Column(name = "delete_yn")
    private boolean deleteYn;
}
