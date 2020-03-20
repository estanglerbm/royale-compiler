/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * classes.A
 *
 * @fileoverview
 *
 * @suppress {checkTypes|accessControls}
 */

goog.provide('classes.A');

goog.require('classes.C');



/**
 * @constructor
 * @extends {classes.C}
 */
classes.A = function() {
  classes.A.base(this, 'constructor');
};
goog.inherits(classes.A, classes.C);


/**
 * Prevent renaming of class. Needed for reflection.
 */
goog.exportSymbol('classes.A', classes.A);


/**
 * Metadata
 *
 * @type {Object.<string, Array.<Object>>}
 */
classes.A.prototype.ROYALE_CLASS_INFO = { names: [{ name: 'A', qName: 'classes.A', kind: 'class' }] };



/**
 * Reflection
 *
 * @return {Object.<string, Function>}
 */
classes.A.prototype.ROYALE_REFLECTION_INFO = function () {
  return {
    methods: function () {
      return {
        'A': { type: '', declaredBy: 'classes.A'}
      };
    }
  };
};
/**
 * @const
 * @type {number}
 */
classes.A.prototype.ROYALE_COMPILE_FLAGS = 9;
