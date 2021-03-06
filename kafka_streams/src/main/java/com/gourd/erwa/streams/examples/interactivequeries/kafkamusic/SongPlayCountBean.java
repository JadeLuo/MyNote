/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gourd.erwa.streams.examples.interactivequeries.kafkamusic;

import java.util.Objects;

public class SongPlayCountBean {

    private String artist;
    private String album;
    private String name;
    private Long plays;

    public SongPlayCountBean() {
    }

    public SongPlayCountBean(final String artist, final String album, final String name, final Long
            plays) {

        this.artist = artist;
        this.album = album;
        this.name = name;
        this.plays = plays;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(final String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(final String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Long getPlays() {
        return plays;
    }

    public void setPlays(final Long plays) {
        this.plays = plays;
    }

    @Override
    public String toString() {
        return "SongPlayCountBean{" +
                "artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", name='" + name + '\'' +
                ", plays=" + plays +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final SongPlayCountBean that = (SongPlayCountBean) o;
        return Objects.equals(artist, that.artist) &&
                Objects.equals(album, that.album) &&
                Objects.equals(name, that.name) &&
                Objects.equals(plays, that.plays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, album, name, plays);
    }
}
