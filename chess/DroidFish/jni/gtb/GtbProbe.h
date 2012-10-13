/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_petero_droidfish_gtb_GtbProbe */

#ifndef _Included_org_petero_droidfish_gtb_GtbProbe
#define _Included_org_petero_droidfish_gtb_GtbProbe
#ifdef __cplusplus
extern "C" {
#endif
#undef org_petero_droidfish_gtb_GtbProbe_NOPIECE
#define org_petero_droidfish_gtb_GtbProbe_NOPIECE 0L
#undef org_petero_droidfish_gtb_GtbProbe_PAWN
#define org_petero_droidfish_gtb_GtbProbe_PAWN 1L
#undef org_petero_droidfish_gtb_GtbProbe_KNIGHT
#define org_petero_droidfish_gtb_GtbProbe_KNIGHT 2L
#undef org_petero_droidfish_gtb_GtbProbe_BISHOP
#define org_petero_droidfish_gtb_GtbProbe_BISHOP 3L
#undef org_petero_droidfish_gtb_GtbProbe_ROOK
#define org_petero_droidfish_gtb_GtbProbe_ROOK 4L
#undef org_petero_droidfish_gtb_GtbProbe_QUEEN
#define org_petero_droidfish_gtb_GtbProbe_QUEEN 5L
#undef org_petero_droidfish_gtb_GtbProbe_KING
#define org_petero_droidfish_gtb_GtbProbe_KING 6L
#undef org_petero_droidfish_gtb_GtbProbe_NOSQUARE
#define org_petero_droidfish_gtb_GtbProbe_NOSQUARE 64L
#undef org_petero_droidfish_gtb_GtbProbe_H1_CASTLE
#define org_petero_droidfish_gtb_GtbProbe_H1_CASTLE 8L
#undef org_petero_droidfish_gtb_GtbProbe_A1_CASTLE
#define org_petero_droidfish_gtb_GtbProbe_A1_CASTLE 4L
#undef org_petero_droidfish_gtb_GtbProbe_H8_CASTLE
#define org_petero_droidfish_gtb_GtbProbe_H8_CASTLE 2L
#undef org_petero_droidfish_gtb_GtbProbe_A8_CASTLE
#define org_petero_droidfish_gtb_GtbProbe_A8_CASTLE 1L
#undef org_petero_droidfish_gtb_GtbProbe_DRAW
#define org_petero_droidfish_gtb_GtbProbe_DRAW 0L
#undef org_petero_droidfish_gtb_GtbProbe_WMATE
#define org_petero_droidfish_gtb_GtbProbe_WMATE 1L
#undef org_petero_droidfish_gtb_GtbProbe_BMATE
#define org_petero_droidfish_gtb_GtbProbe_BMATE 2L
#undef org_petero_droidfish_gtb_GtbProbe_FORBID
#define org_petero_droidfish_gtb_GtbProbe_FORBID 3L
#undef org_petero_droidfish_gtb_GtbProbe_UNKNOWN
#define org_petero_droidfish_gtb_GtbProbe_UNKNOWN 7L
/*
 * Class:     org_petero_droidfish_gtb_GtbProbe
 * Method:    probeHard
 * Signature: (ZII[I[I[B[B[I)Z
 */
JNIEXPORT jboolean JNICALL Java_com_chess_android_appdevthree_gtb_GtbProbe_probeHard
  (JNIEnv *, jobject, jboolean, jint, jint, jintArray, jintArray, jbyteArray, jbyteArray, jintArray);

/*
 * Class:     org_petero_droidfish_gtb_GtbProbe
 * Method:    init
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_chess_android_appdevthree_gtb_GtbProbe_init
  (JNIEnv *, jclass, jstring);

#ifdef __cplusplus
}
#endif
#endif
