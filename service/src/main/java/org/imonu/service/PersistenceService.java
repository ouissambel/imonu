package org.imonu.service;

import java.util.List;
import java.util.Optional;

import io.vavr.control.Try;
import org.imonu.domain.Item;

public interface PersistenceService {
	<T extends Item> List<T> getAllItems(Class<T> clazz);
	Try<Item> save(Item item);
	<T extends Item> Optional<T> load(String itemId, Class<T> clazz);


	boolean createIndex(final String indexName);
}
