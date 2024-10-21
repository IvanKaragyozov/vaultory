CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE albums
(
    album_id          UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    album_name        VARCHAR(255) NOT NULL,
    album_description TEXT,
    album_created_at  TIMESTAMP        DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE photos
(
    photo_id          UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    photo_album_id    UUID REFERENCES albums (album_id),
    photo_name        VARCHAR(255) NOT NULL,
    photo_image_data  BYTEA        NOT NULL,
    photo_format      VARCHAR(50),
    photo_upload_date TIMESTAMP        DEFAULT CURRENT_TIMESTAMP,
    photo_metadata    JSONB, -- Extracted metadata (EXIF)
    photo_size_bytes  BIGINT,
    photo_width       INT,
    photo_height      INT
);

CREATE TABLE tags
(
    tag_id   UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    tag_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE photo_tags
(
    photo_tags_photo_id UUID
        REFERENCES photos (photo_id)
            ON DELETE CASCADE,
    photo_tags_tag_id   UUID
        REFERENCES tags (tag_id)
            ON DELETE CASCADE,
    PRIMARY KEY (photo_tags_photo_id, photo_tags_tag_id)
);