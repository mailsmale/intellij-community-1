/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.groovy.lang;

import com.intellij.psi.PsiElement;
import com.intellij.psi.codeStyle.JavaCodeStyleManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.lang.psi.GrQualifiedReference;

/**
 * @author Max Medvedev
 */
public class GrReferenceAdjuster {
  private GrReferenceAdjuster() {
  }

  /**
   * @deprecated use com.intellij.psi.codeStyle.JavaCodeStyleManager#shortenReferences(PsiElement) instead
   */
  public static void shortenReferences(@NotNull PsiElement element) {
    JavaCodeStyleManager.getInstance(element.getProject()).shortenClassReferences(element);
  }

  /**
   * @deprecated use org.jetbrains.plugins.groovy.codeStyle.GrReferenceAdjuster#shortenReference(PsiElement) instead
   */
  public static <T extends PsiElement> boolean shortenReference(@NotNull GrQualifiedReference<T> ref) {
    return org.jetbrains.plugins.groovy.codeStyle.GrReferenceAdjuster.shortenReference(ref);
  }
}
