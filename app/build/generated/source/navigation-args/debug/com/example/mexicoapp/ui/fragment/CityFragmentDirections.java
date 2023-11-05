package com.example.mexicoapp.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mexicoapp.R;

public class CityFragmentDirections {
  private CityFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationCityToDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_navigation_city_to_detailFragment);
  }
}
