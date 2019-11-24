package com.alfin.myunittesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class MainViewModelTest {

    private MainViewModel mainViewModel;
    private CuboidModel cuboidModel;

    private final double dummyLength = 12.0;
    private final double dummyWidth = 7.0;
    private final double dummyHeight = 6.0;
    private final double dummyVolume = 500.0;

    @Before
    public void before() {
        cuboidModel = mock(CuboidModel.class);
        mainViewModel = new MainViewModel(cuboidModel);
    }

    @Test
    public void testVolume() {
        cuboidModel = new CuboidModel();
        mainViewModel = new MainViewModel(cuboidModel);
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight);
        double volume = mainViewModel.getVolume();
        assertEquals(dummyVolume, volume, 0.0001);
    }
}