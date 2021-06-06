package com.example.prac;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


    @Entity
    @Table(name="Coursess")
    public class Course2 {
        @Id
        private long id;
        private String title;
        private String description;

        public Long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public Course2(int id, String title, String description) {
            this.id = id;
            this.title = title;
            this.description = description;
        }

        public Course2() {
            super();
        }


    }


