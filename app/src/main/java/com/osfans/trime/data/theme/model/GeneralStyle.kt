// SPDX-FileCopyrightText: 2015 - 2024 Rime community
//
// SPDX-License-Identifier: GPL-3.0-or-later

package com.osfans.trime.data.theme.model

import com.osfans.trime.ime.symbol.VarLengthAdapter.SecondTextPosition

data class GeneralStyle(
    val autoCaps: String,
    val backgroundDimAmount: Float,
    val candidateBorder: Int,
    val candidateBorderRound: Int,
    val candidateFont: List<String>,
    val candidatePadding: Int,
    val candidateSpacing: Float,
    val candidateTextSize: Int,
    val candidateUseCursor: Boolean,
    val candidateViewHeight: Int,
    val colorScheme: String,
    val commentFont: List<String>,
    val commentHeight: Int,
    val commentOnTop: Boolean,
    val commentPosition: SecondTextPosition,
    val commentTextSize: Int,
    val hanbFont: List<String>,
    val horizontal: Boolean,
    val horizontalGap: Int,
    val keyboardPadding: Int,
    val keyboardPaddingLeft: Int,
    val keyboardPaddingRight: Int,
    val keyboardPaddingBottom: Int,
    val keyboardPaddingLand: Int,
    val keyboardPaddingLandBottom: Int,
    val layout: Layout,
    val window: List<CompositionComponent>,
    val liquidKeyboardWindow: List<CompositionComponent>,
    val keyFont: List<String>,
    val keyBorder: Int,
    val keyHeight: Int,
    val keyLongTextSize: Float,
    val keyTextSize: Int,
    val keyTextOffsetX: Int,
    val keyTextOffsetY: Int,
    val keySymbolOffsetX: Int,
    val keySymbolOffsetY: Int,
    val keyHintOffsetX: Int,
    val keyHintOffsetY: Int,
    val keyPressOffsetX: Int,
    val keyPressOffsetY: Int,
    val keyWidth: Float,
    val keyboards: List<String>,
    val labelTextSize: Int,
    val labelFont: List<String>,
    val latinFont: List<String>,
    val latinLocale: String,
    val locale: String,
    val keyboardHeight: Int,
    val keyboardHeightLand: Int,
    val previewFont: List<String>,
    val previewHeight: Int,
    val previewOffset: Int,
    val previewTextSize: Int,
    val proximityCorrection: Boolean,
    val resetASCIIMode: Boolean,
    val roundCorner: Int,
    val shadowRadius: Float,
    val speechOpenccConfig: String,
    val symbolFont: List<String>,
    val symbolTextSize: Int,
    val textFont: List<String>,
    val textSize: Int,
    val verticalCorrection: Int,
    val verticalGap: Int,
    val longTextFont: List<String>,
    val backgroundFolder: String,
    val keyLongTextBorder: Int,
    val enterLabelMode: Int,
    val enterLabel: EnterLabel,
)
