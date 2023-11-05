package com.example.mexicoapp.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mexicoapp.R;

public class WeatherFragmentDirections {
  private WeatherFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWeatherFragmentToDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_weatherFragment_to_detailFragment);
  }
}
