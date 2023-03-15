package net.rafaeltoledo.coverage;

import static junit.framework.TestCase.assertNotNull;

import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(RobolectricTestRunner.class)
public class MainActivityUnitTest {
    private MainActivity activity;

    @Before
    public void setUp() {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() {
        assertNotNull(activity);
    }

    @Test
    public void shouldHideButtonAfterClick() {
        Button button = activity.findViewById(R.id.hide);
        button.performClick();

        assertThat(button.getVisibility(), is(View.GONE));
    }
}
