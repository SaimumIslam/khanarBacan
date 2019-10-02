package com.example.foysal.khanarbacan;

/**
 * Created by Foysal on 10/20/2017.
 */

public class Product {
        private String name;
        private int thumbnail;

        public Product() {
        }

        public Product(String name, int thumbnail) {
            this.name = name;
            this.thumbnail = thumbnail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(int thumbnail) {
            this.thumbnail = thumbnail;
        }
    
}
