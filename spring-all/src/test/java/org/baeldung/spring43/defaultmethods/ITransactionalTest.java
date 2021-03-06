package org.baeldung.spring43.defaultmethods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

public interface ITransactionalTest {

    Logger log = LoggerFactory.getLogger(ITransactionalTest.class);

    @BeforeTransaction
    default void beforeTransaction() {
        log.info("Opening transaction");
    }

    @AfterTransaction
    default void afterTransaction() {
        log.info("Closing transaction");
    }

}
