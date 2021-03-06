/*
 * Copyright 2020 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/common.proto

package com.google.cloud.gaming.v1alpha;

public interface FleetDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.FleetDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The cluster name.
   * </pre>
   *
   * <code>string game_server_cluster_name = 1;</code>
   *
   * @return The gameServerClusterName.
   */
  java.lang.String getGameServerClusterName();
  /**
   *
   *
   * <pre>
   * The cluster name.
   * </pre>
   *
   * <code>string game_server_cluster_name = 1;</code>
   *
   * @return The bytes for gameServerClusterName.
   */
  com.google.protobuf.ByteString getGameServerClusterNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the Agones game server fleet.
   * </pre>
   *
   * <code>string fleet_name = 2;</code>
   *
   * @return The fleetName.
   */
  java.lang.String getFleetName();
  /**
   *
   *
   * <pre>
   * The name of the Agones game server fleet.
   * </pre>
   *
   * <code>string fleet_name = 2;</code>
   *
   * @return The bytes for fleetName.
   */
  com.google.protobuf.ByteString getFleetNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the game server config object whose fleet spec
   * is used to create the fleet.
   * </pre>
   *
   * <code>string game_server_config_name = 3;</code>
   *
   * @return The gameServerConfigName.
   */
  java.lang.String getGameServerConfigName();
  /**
   *
   *
   * <pre>
   * The name of the game server config object whose fleet spec
   * is used to create the fleet.
   * </pre>
   *
   * <code>string game_server_config_name = 3;</code>
   *
   * @return The bytes for gameServerConfigName.
   */
  com.google.protobuf.ByteString getGameServerConfigNameBytes();

  /**
   *
   *
   * <pre>
   * Details about the agones autoscaler.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.FleetDetails.AutoscalerDetails autoscaler_details = 4;
   * </code>
   *
   * @return Whether the autoscalerDetails field is set.
   */
  boolean hasAutoscalerDetails();
  /**
   *
   *
   * <pre>
   * Details about the agones autoscaler.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.FleetDetails.AutoscalerDetails autoscaler_details = 4;
   * </code>
   *
   * @return The autoscalerDetails.
   */
  com.google.cloud.gaming.v1alpha.FleetDetails.AutoscalerDetails getAutoscalerDetails();
  /**
   *
   *
   * <pre>
   * Details about the agones autoscaler.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.FleetDetails.AutoscalerDetails autoscaler_details = 4;
   * </code>
   */
  com.google.cloud.gaming.v1alpha.FleetDetails.AutoscalerDetailsOrBuilder
      getAutoscalerDetailsOrBuilder();
}
