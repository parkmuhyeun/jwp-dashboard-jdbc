package org.springframework.transaction.support;

@FunctionalInterface
public interface BusinessLogicProcessor {

    void process();
}
