package com.yalantis.ucrop.model;

import androidx.annotation.Nullable;
import android.graphics.Bitmap;

/**
 * Created by Oleksii Shliama [https://github.com/shliama] on 6/21/16.
 */
public class CropParameters {

    private int mMaxResultImageSizeX, mMaxResultImageSizeY;

    private Bitmap.CompressFormat mCompressFormat;

    private int mCompressQuality;

    @Nullable
    private String mImageInputPath, mImageOutputPath;

    @Nullable
    private ExifInfo mExifInfo;

    public CropParameters(int maxResultImageSizeX, int maxResultImageSizeY, Bitmap.CompressFormat compressFormat, int compressQuality, @Nullable String imageInputPath, @Nullable String imageOutputPath, @Nullable ExifInfo exifInfo) {
        mMaxResultImageSizeX = maxResultImageSizeX;
        mMaxResultImageSizeY = maxResultImageSizeY;
        mCompressFormat = compressFormat;
        mCompressQuality = compressQuality;
        mImageInputPath = imageInputPath;
        mImageOutputPath = imageOutputPath;
        mExifInfo = exifInfo;
    }

    public int getMaxResultImageSizeX() {
        return mMaxResultImageSizeX;
    }

    public int getMaxResultImageSizeY() {
        return mMaxResultImageSizeY;
    }

    public Bitmap.CompressFormat getCompressFormat() {
        return mCompressFormat;
    }

    public int getCompressQuality() {
        return mCompressQuality;
    }

    @Nullable
    public String getImageInputPath() {
        return mImageInputPath;
    }

    @Nullable
    public String getImageOutputPath() {
        return mImageOutputPath;
    }

    @Nullable
    public ExifInfo getExifInfo() {
        return mExifInfo;
    }
}
