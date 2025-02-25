CREATE TABLE IF NOT EXISTS USERS (
                                     uuid UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS POSTS (
                                     uuid UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    user_uuid UUID NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (user_uuid) REFERENCES USERS(uuid) ON DELETE CASCADE
    );
