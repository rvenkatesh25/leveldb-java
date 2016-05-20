package com.circle.leveldb.api;

/**
 * @author viyer
 * @version 0.1 Build 5/19/16.
 */
public interface DB {
    public void put(byte[] key, byte[] value) throws LeveldbException;
}