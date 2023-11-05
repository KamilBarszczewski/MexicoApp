package com.example.mexicoapp.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mexicoapp.R;

public class DetailFragmentDirections {
  private DetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailFragmentToNavigationArchZone() {
    return new ActionOnlyNavDirections(R.id.action_detailFragment_to_navigation_arch_zone);
  }

  @NonNull
  public static NavDirections actionDetailFragmentToNavigationCity() {
    return new ActionOnlyNavDirections(R.id.action_detailFragment_to_navigation_city);
  }

  @NonNull
  public static NavDirections actionDetailFragmentToNavigationNature() {
    return new ActionOnlyNavDirections(R.id.action_detailFragment_to_navigation_nature);
  }

  @NonNull
  public static NavDirections actionDetailFragmentToWeatherFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailFragment_to_weatherFragment);
  }
}
