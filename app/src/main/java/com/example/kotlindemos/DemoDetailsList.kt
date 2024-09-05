/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.kotlindemos

import com.example.kotlindemos.polyline.PolylineDemoActivity

/**
 * A list of all the demos we have available.
 */
class DemoDetailsList {
    companion object {
        val DEMOS = listOf(
//            DemoDetails(
//                R.string.advanced_markers_demo_label,
//                R.string.advanced_markers_demo_details,
//                AdvancedMarkersDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.basic_demo_label,
//                R.string.basic_demo_details,
//                BasicMapDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.background_color_customization_demo_label,
//                R.string.background_color_customization_demo_description,
//                BackgroundColorCustomizationDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.background_color_customization_programmatic_demo_label,
//                R.string.background_color_customization_programmatic_demo_description,
//                BackgroundColorCustomizationProgrammaticDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.camera_demo_label,
//                R.string.camera_demo_description,
//                CameraDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.camera_clamping_demo_label,
//                R.string.camera_clamping_demo_description,
//                CameraClampingDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.circle_demo_label, R.string.circle_demo_details,
//                CircleDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.cloud_styling_label, R.string.cloud_styling_description,
//                CloudBasedMapStylingDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.close_info_window_demo_label,
//                R.string.close_info_window_demo_details,
//                MarkerCloseInfoWindowOnRetapDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.events_demo_label,
//                R.string.events_demo_details,
//                EventsDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.ground_overlay_demo_label,
//                R.string.ground_overlay_demo_details,
//                GroundOverlayDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.indoor_demo_label,
//                R.string.indoor_demo_details,
//                IndoorDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.layers_demo_label,
//                R.string.layers_demo_description,
//                LayersDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.lite_demo_label,
//                R.string.lite_demo_details,
//                LiteDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.location_source_demo_label,
//                R.string.location_source_demo_description,
//                LocationSourceDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.lite_list_demo_label,
//                R.string.lite_list_demo_details,
//                LiteListDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.map_in_pager_demo_label,
//                R.string.map_in_pager_demo_description,
//                MapInPagerDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.map_color_scheme_demo_label,
//                R.string.map_color_scheme_demo_description,
//                MapColorSchemeActivity::class.java
//            ),
//            DemoDetails(
//                R.string.markers_demo_label,
//                R.string.markers_demo_description,
//                MapColorSchemeActivity::class.java
//            ),
//            DemoDetails(
//                R.string.multi_map_demo_label,
//                R.string.multi_map_demo_description,
//                MultiMapDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.my_location_demo_label,
//                R.string.my_location_demo_details,
//                MyLocationDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.options_demo_label,
//                R.string.options_demo_description,
//                OptionsDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.polygon_demo_label,
//                R.string.polygon_demo_details,
//                PolygonDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.polyline_demo_label,
//                R.string.polyline_demo_description,
//                PolylineDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.programmatic_demo_label,
//                R.string.programmatic_demo_description,
//                ProgrammaticDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.raw_map_view_demo_label,
//                R.string.raw_map_view_demo_description,
//                RawMapViewDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.save_state_demo_label,
//                R.string.save_state_demo_description,
//                SaveStateDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.snapshot_demo_label,
//                R.string.snapshot_demo_description,
//                SnapshotDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.street_view_panorama_basic_demo_label,
//                R.string.street_view_panorama_basic_demo_details,
//                StreetViewPanoramaBasicDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.street_view_panorama_navigation_demo_label,
//                R.string.street_view_panorama_navigation_demo_details,
//                StreetViewPanoramaNavigationDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.split_street_view_panorama_and_map_demo_label,
//                R.string.split_street_view_panorama_and_map_demo_details,
//                SplitStreetViewPanoramaAndMapDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.street_view_panorama_options_demo_label,
//                R.string.street_view_panorama_options_demo_details,
//                StreetViewPanoramaOptionsDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.street_view_panorama_events_demo_label,
//                R.string.street_view_panorama_events_demo_details,
//                StreetViewPanoramaEventsDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.street_view_panorama_view_demo_label,
//                R.string.street_view_panorama_view_demo_details,
//                StreetViewPanoramaViewDemoActivity::class.java
//            ),
            DemoDetails(
                R.string.styled_map_demo_label,
                R.string.styled_map_demo_description,
                StyledMapDemoActivity::class.java
            ),
//            DemoDetails(
//                R.string.tags_demo_label,
//                R.string.tags_demo_details,
//                TagsDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.tile_coordinate_demo_label,
//                R.string.tile_coordinate_demo_description,
//                TileCoordinateDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.tile_overlay_demo_label,
//                R.string.tile_overlay_demo_description,
//                TileOverlayDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.ui_settings_demo_label,
//                R.string.ui_settings_demo_details,
//                UiSettingsDemoActivity::class.java
//            ),
//            DemoDetails(
//                R.string.region_demo_label,
//                R.string.region_demo_details,
//                VisibleRegionDemoActivity::class.java
//            )
        )
    }
}