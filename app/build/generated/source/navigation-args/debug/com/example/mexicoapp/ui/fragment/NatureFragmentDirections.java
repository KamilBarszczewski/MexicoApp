package com.example.mexicoapp.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mexicoapp.R;

public class NatureFragmentDirections {
  private NatureFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationNatureToDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_navigation_nature_to_detailFragment);
  }
}
