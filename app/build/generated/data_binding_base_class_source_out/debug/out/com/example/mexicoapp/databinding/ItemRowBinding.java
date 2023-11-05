// Generated by view binder compiler. Do not edit!
package com.example.mexicoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mexicoapp.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRowBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView snippetTv;

  @NonNull
  public final TextView titleTv;

  @NonNull
  public final TextView transTitleTv;

  private ItemRowBinding(@NonNull MaterialCardView rootView, @NonNull ImageView imageView,
      @NonNull TextView snippetTv, @NonNull TextView titleTv, @NonNull TextView transTitleTv) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.snippetTv = snippetTv;
    this.titleTv = titleTv;
    this.transTitleTv = transTitleTv;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.snippet_tv;
      TextView snippetTv = ViewBindings.findChildViewById(rootView, id);
      if (snippetTv == null) {
        break missingId;
      }

      id = R.id.title_tv;
      TextView titleTv = ViewBindings.findChildViewById(rootView, id);
      if (titleTv == null) {
        break missingId;
      }

      id = R.id.trans_title_tv;
      TextView transTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (transTitleTv == null) {
        break missingId;
      }

      return new ItemRowBinding((MaterialCardView) rootView, imageView, snippetTv, titleTv,
          transTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}