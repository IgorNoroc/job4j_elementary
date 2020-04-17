package ru.job4j.turism;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenCollectAll() {
        List<Profile> input = Arrays.asList(
                new Profile(new Address("NY", "street3", 1, 60)),
                new Profile(new Address("Moscow", "street3", 1, 60)),
                new Profile(new Address("Moscow", "street2", 1, 60)),
                new Profile(new Address("Moscow", "street3", 1, 60))
        );
        List<Address> expected = Arrays.asList(
                new Address("Moscow", "street3", 1, 60),
                new Address("Moscow", "street2", 1, 60),
                new Address("NY", "street3", 1, 60)
        );
        List<Address> result = new Profiles().collect(input);
        assertThat(result, is(expected));
    }
}
