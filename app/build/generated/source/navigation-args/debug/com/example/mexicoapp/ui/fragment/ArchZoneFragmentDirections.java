package com.example.mexicoapp.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mexicoapp.R;

public class ArchZoneFragmentDirections {
  private ArchZoneFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationArchZoneToDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_navigation_archZone_to_detailFragment);
  }
}
