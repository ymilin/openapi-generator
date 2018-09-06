/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

type MapTest struct {
	MapMapOfString  map[string]map[string]string `json:"map_map_of_string,omitempty" xml:"map_map_of_string"`
	MapOfEnumString map[string]string            `json:"map_of_enum_string,omitempty" xml:"map_of_enum_string"`
	DirectMap       map[string]bool              `json:"direct_map,omitempty" xml:"direct_map"`
	IndirectMap     StringBooleanMap             `json:"indirect_map,omitempty" xml:"indirect_map"`
}
