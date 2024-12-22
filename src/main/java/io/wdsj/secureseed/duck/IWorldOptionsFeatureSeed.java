package io.wdsj.secureseed.duck;

public interface IWorldOptionsFeatureSeed {
    long[] secureSeed$featureSeed();
    void secureSeed$setFeatureSeed(long[] seed);
    String secureSeed$featureSeedSerialize();
}
