// Generated by view binder compiler. Do not edit!
package com.example.mexicoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mexicoapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWeatherBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final Guideline glHbottom;

  @NonNull
  public final Guideline glHtop;

  @NonNull
  public final Guideline glMainCard;

  @NonNull
  public final Guideline glMainForecastBtn;

  @NonNull
  public final Guideline glMainLocation;

  @NonNull
  public final Guideline glMainTemp;

  @NonNull
  public final Guideline glVLeft;

  @NonNull
  public final Guideline glVMiddle;

  @NonNull
  public final Guideline glVRight;

  @NonNull
  public final ImageView imgHumidity;

  @NonNull
  public final ImageView imgPollution;

  @NonNull
  public final ImageView imgPressure;

  @NonNull
  public final ImageView imgSunrise;

  @NonNull
  public final ImageView imgSunset;

  @NonNull
  public final ImageView imgWeather;

  @NonNull
  public final ImageView imgWind;

  @NonNull
  public final LinearLayout layoutPollution;

  @NonNull
  public final TextView tvAirQual;

  @NonNull
  public final TextView tvFeelsLike;

  @NonNull
  public final TextView tvForecast;

  @NonNull
  public final TextView tvHumidity;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final TextView tvMaxTemp;

  @NonNull
  public final TextView tvMinTemp;

  @NonNull
  public final TextView tvPressure;

  @NonNull
  public final TextView tvStatus;

  @NonNull
  public final TextView tvSunrise;

  @NonNull
  public final TextView tvSunset;

  @NonNull
  public final TextView tvTemp;

  @NonNull
  public final TextView tvUpdateTime;

  @NonNull
  public final TextView tvWind;

  private FragmentWeatherBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout,
      @NonNull Guideline glHbottom, @NonNull Guideline glHtop, @NonNull Guideline glMainCard,
      @NonNull Guideline glMainForecastBtn, @NonNull Guideline glMainLocation,
      @NonNull Guideline glMainTemp, @NonNull Guideline glVLeft, @NonNull Guideline glVMiddle,
      @NonNull Guideline glVRight, @NonNull ImageView imgHumidity, @NonNull ImageView imgPollution,
      @NonNull ImageView imgPressure, @NonNull ImageView imgSunrise, @NonNull ImageView imgSunset,
      @NonNull ImageView imgWeather, @NonNull ImageView imgWind,
      @NonNull LinearLayout layoutPollution, @NonNull TextView tvAirQual,
      @NonNull TextView tvFeelsLike, @NonNull TextView tvForecast, @NonNull TextView tvHumidity,
      @NonNull TextView tvLocation, @NonNull TextView tvMaxTemp, @NonNull TextView tvMinTemp,
      @NonNull TextView tvPressure, @NonNull TextView tvStatus, @NonNull TextView tvSunrise,
      @NonNull TextView tvSunset, @NonNull TextView tvTemp, @NonNull TextView tvUpdateTime,
      @NonNull TextView tvWind) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.frameLayout = frameLayout;
    this.glHbottom = glHbottom;
    this.glHtop = glHtop;
    this.glMainCard = glMainCard;
    this.glMainForecastBtn = glMainForecastBtn;
    this.glMainLocation = glMainLocation;
    this.glMainTemp = glMainTemp;
    this.glVLeft = glVLeft;
    this.glVMiddle = glVMiddle;
    this.glVRight = glVRight;
    this.imgHumidity = imgHumidity;
    this.imgPollution = imgPollution;
    this.imgPressure = imgPressure;
    this.imgSunrise = imgSunrise;
    this.imgSunset = imgSunset;
    this.imgWeather = imgWeather;
    this.imgWind = imgWind;
    this.layoutPollution = layoutPollution;
    this.tvAirQual = tvAirQual;
    this.tvFeelsLike = tvFeelsLike;
    this.tvForecast = tvForecast;
    this.tvHumidity = tvHumidity;
    this.tvLocation = tvLocation;
    this.tvMaxTemp = tvMaxTemp;
    this.tvMinTemp = tvMinTemp;
    this.tvPressure = tvPressure;
    this.tvStatus = tvStatus;
    this.tvSunrise = tvSunrise;
    this.tvSunset = tvSunset;
    this.tvTemp = tvTemp;
    this.tvUpdateTime = tvUpdateTime;
    this.tvWind = tvWind;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_weather, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWeatherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.glHbottom;
      Guideline glHbottom = ViewBindings.findChildViewById(rootView, id);
      if (glHbottom == null) {
        break missingId;
      }

      id = R.id.glHtop;
      Guideline glHtop = ViewBindings.findChildViewById(rootView, id);
      if (glHtop == null) {
        break missingId;
      }

      id = R.id.glMainCard;
      Guideline glMainCard = ViewBindings.findChildViewById(rootView, id);
      if (glMainCard == null) {
        break missingId;
      }

      id = R.id.glMainForecastBtn;
      Guideline glMainForecastBtn = ViewBindings.findChildViewById(rootView, id);
      if (glMainForecastBtn == null) {
        break missingId;
      }

      id = R.id.glMainLocation;
      Guideline glMainLocation = ViewBindings.findChildViewById(rootView, id);
      if (glMainLocation == null) {
        break missingId;
      }

      id = R.id.glMainTemp;
      Guideline glMainTemp = ViewBindings.findChildViewById(rootView, id);
      if (glMainTemp == null) {
        break missingId;
      }

      id = R.id.glVLeft;
      Guideline glVLeft = ViewBindings.findChildViewById(rootView, id);
      if (glVLeft == null) {
        break missingId;
      }

      id = R.id.glVMiddle;
      Guideline glVMiddle = ViewBindings.findChildViewById(rootView, id);
      if (glVMiddle == null) {
        break missingId;
      }

      id = R.id.glVRight;
      Guideline glVRight = ViewBindings.findChildViewById(rootView, id);
      if (glVRight == null) {
        break missingId;
      }

      id = R.id.imgHumidity;
      ImageView imgHumidity = ViewBindings.findChildViewById(rootView, id);
      if (imgHumidity == null) {
        break missingId;
      }

      id = R.id.imgPollution;
      ImageView imgPollution = ViewBindings.findChildViewById(rootView, id);
      if (imgPollution == null) {
        break missingId;
      }

      id = R.id.imgPressure;
      ImageView imgPressure = ViewBindings.findChildViewById(rootView, id);
      if (imgPressure == null) {
        break missingId;
      }

      id = R.id.imgSunrise;
      ImageView imgSunrise = ViewBindings.findChildViewById(rootView, id);
      if (imgSunrise == null) {
        break missingId;
      }

      id = R.id.imgSunset;
      ImageView imgSunset = ViewBindings.findChildViewById(rootView, id);
      if (imgSunset == null) {
        break missingId;
      }

      id = R.id.img_weather;
      ImageView imgWeather = ViewBindings.findChildViewById(rootView, id);
      if (imgWeather == null) {
        break missingId;
      }

      id = R.id.imgWind;
      ImageView imgWind = ViewBindings.findChildViewById(rootView, id);
      if (imgWind == null) {
        break missingId;
      }

      id = R.id.layout_pollution;
      LinearLayout layoutPollution = ViewBindings.findChildViewById(rootView, id);
      if (layoutPollution == null) {
        break missingId;
      }

      id = R.id.tvAirQual;
      TextView tvAirQual = ViewBindings.findChildViewById(rootView, id);
      if (tvAirQual == null) {
        break missingId;
      }

      id = R.id.tv_feels_like;
      TextView tvFeelsLike = ViewBindings.findChildViewById(rootView, id);
      if (tvFeelsLike == null) {
        break missingId;
      }

      id = R.id.tv_forecast;
      TextView tvForecast = ViewBindings.findChildViewById(rootView, id);
      if (tvForecast == null) {
        break missingId;
      }

      id = R.id.tvHumidity;
      TextView tvHumidity = ViewBindings.findChildViewById(rootView, id);
      if (tvHumidity == null) {
        break missingId;
      }

      id = R.id.tv_location;
      TextView tvLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvLocation == null) {
        break missingId;
      }

      id = R.id.tv_max_temp;
      TextView tvMaxTemp = ViewBindings.findChildViewById(rootView, id);
      if (tvMaxTemp == null) {
        break missingId;
      }

      id = R.id.tv_min_temp;
      TextView tvMinTemp = ViewBindings.findChildViewById(rootView, id);
      if (tvMinTemp == null) {
        break missingId;
      }

      id = R.id.tvPressure;
      TextView tvPressure = ViewBindings.findChildViewById(rootView, id);
      if (tvPressure == null) {
        break missingId;
      }

      id = R.id.tv_status;
      TextView tvStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvStatus == null) {
        break missingId;
      }

      id = R.id.tvSunrise;
      TextView tvSunrise = ViewBindings.findChildViewById(rootView, id);
      if (tvSunrise == null) {
        break missingId;
      }

      id = R.id.tvSunset;
      TextView tvSunset = ViewBindings.findChildViewById(rootView, id);
      if (tvSunset == null) {
        break missingId;
      }

      id = R.id.tv_temp;
      TextView tvTemp = ViewBindings.findChildViewById(rootView, id);
      if (tvTemp == null) {
        break missingId;
      }

      id = R.id.tv_update_time;
      TextView tvUpdateTime = ViewBindings.findChildViewById(rootView, id);
      if (tvUpdateTime == null) {
        break missingId;
      }

      id = R.id.tvWind;
      TextView tvWind = ViewBindings.findChildViewById(rootView, id);
      if (tvWind == null) {
        break missingId;
      }

      return new FragmentWeatherBinding((ConstraintLayout) rootView, constraintLayout, frameLayout,
          glHbottom, glHtop, glMainCard, glMainForecastBtn, glMainLocation, glMainTemp, glVLeft,
          glVMiddle, glVRight, imgHumidity, imgPollution, imgPressure, imgSunrise, imgSunset,
          imgWeather, imgWind, layoutPollution, tvAirQual, tvFeelsLike, tvForecast, tvHumidity,
          tvLocation, tvMaxTemp, tvMinTemp, tvPressure, tvStatus, tvSunrise, tvSunset, tvTemp,
          tvUpdateTime, tvWind);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
