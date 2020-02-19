package org.wecancodeit.reviews;

import org.wecancodeit.reviews.models.HashtagRepository;
import org.wecancodeit.reviews.models.HashtagStorage;

import java.util.Collection;
        import java.util.Collections;

public class HashtagStorageJpaImpl implements HashtagStorage {

    HashtagRepository repository;

    public HashtagStorageJpaImpl(HashtagRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Hashtag> getAll() {
        return (Collection<Hashtag>) repository.findAll();
    }
    @Override
    public void add(Hashtag hashtag) {

        repository.save(hashtag);

    }
}
