package searchengine.services;

import searchengine.config.Page;
import searchengine.dto.statistics.IndexingResponse;

import java.util.concurrent.ExecutionException;

public interface IndexService {

    IndexingResponse startIndexing() throws ExecutionException, InterruptedException;
    IndexingResponse stopIndexing();
    IndexingResponse indexPage(Page page);
}
