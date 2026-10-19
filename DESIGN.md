---
name: Merchant Hub
colors:
  surface: '#f8f9ff'
  surface-dim: '#cbdbf5'
  surface-bright: '#f8f9ff'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#eff4ff'
  surface-container: '#e5eeff'
  surface-container-high: '#dce9ff'
  surface-container-highest: '#d3e4fe'
  on-surface: '#0b1c30'
  on-surface-variant: '#464555'
  inverse-surface: '#213145'
  inverse-on-surface: '#eaf1ff'
  outline: '#777587'
  outline-variant: '#c7c4d8'
  surface-tint: '#4d44e3'
  primary: '#3525cd'
  on-primary: '#ffffff'
  primary-container: '#4f46e5'
  on-primary-container: '#dad7ff'
  inverse-primary: '#c3c0ff'
  secondary: '#006a61'
  on-secondary: '#ffffff'
  secondary-container: '#86f2e4'
  on-secondary-container: '#006f66'
  tertiary: '#434853'
  on-tertiary: '#ffffff'
  tertiary-container: '#5b606b'
  on-tertiary-container: '#d7dbe8'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#e2dfff'
  primary-fixed-dim: '#c3c0ff'
  on-primary-fixed: '#0f0069'
  on-primary-fixed-variant: '#3323cc'
  secondary-fixed: '#89f5e7'
  secondary-fixed-dim: '#6bd8cb'
  on-secondary-fixed: '#00201d'
  on-secondary-fixed-variant: '#005049'
  tertiary-fixed: '#dee2ef'
  tertiary-fixed-dim: '#c2c6d3'
  on-tertiary-fixed: '#171c25'
  on-tertiary-fixed-variant: '#424751'
  background: '#f8f9ff'
  on-background: '#0b1c30'
  surface-variant: '#d3e4fe'
typography:
  headline-xl:
    fontFamily: Plus Jakarta Sans
    fontSize: 2rem
    fontWeight: '700'
    lineHeight: 2.5rem
  headline-xl-mobile:
    fontFamily: Plus Jakarta Sans
    fontSize: 1.75rem
    fontWeight: '700'
    lineHeight: 2.25rem
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 1.5rem
    fontWeight: '600'
    lineHeight: 2rem
  headline-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 1.25rem
    fontWeight: '600'
    lineHeight: 1.75rem
  title-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 1rem
    fontWeight: '600'
    lineHeight: 1.5rem
  body-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 1rem
    fontWeight: '400'
    lineHeight: 1.5rem
  body-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 0.875rem
    fontWeight: '400'
    lineHeight: 1.25rem
  body-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 0.75rem
    fontWeight: '400'
    lineHeight: 1rem
  code-lg:
    fontFamily: JetBrains Mono
    fontSize: 1.125rem
    fontWeight: '500'
    lineHeight: 1.5rem
  code-md:
    fontFamily: JetBrains Mono
    fontSize: 0.875rem
    fontWeight: '500'
    lineHeight: 1.25rem
  label-badge:
    fontFamily: JetBrains Mono
    fontSize: 0.75rem
    fontWeight: '600'
    lineHeight: 1rem
    letterSpacing: 0.05em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 1rem
  gutter-mobile: 0.75rem
  margin: 1.5rem
  margin-mobile: 1rem
  space-xs: 0.25rem
  space-sm: 0.5rem
  space-md: 1rem
  space-lg: 1.5rem
  space-xl: 2rem
---

## Brand & Style

This design system targets modern commerce operators, B2B merchants, and digital-first entrepreneurs managing mission-critical store infrastructure from mobile interfaces. The aesthetic balances the razor-sharp clarity of developer platforms with the approachable precision of high-scale commerce admin tooling. 

The emotional tone communicates structural reliability, velocity, and fiscal transparency. Surfaces feel pristine, deliberate, and light on cognitive friction. The design movement marries **Corporate / Modern FinTech** precision with soft tactile restraint: utilizing elevated pure white surfaces against cool slate canvases, purposeful brand color hits, and clean hairline borders rather than heavy decorative styling.

## Colors

The palette is engineered for prolonged operational focus, high legibility in mobile onboarding contexts, and clear visual hierarchy for monetary values and status confirmations.

- **Canvas Background (`#F8FAFC`)**: Slate White provides a soft, low-glare backdrop that lifts foreground containers.
- **Surface Layer (`#FFFFFF`)**: Pure white cards isolate actionable domains and form groups.
- **Primary Accent (`#4F46E5`)**: Deep Indigo drives primary calls to action, active navigation states, and key interactive selections.
- **Secondary Accent (`#0D9488`)**: Emerald Teal signifies active verification states, positive financial deltas, and completed onboarding steps.
- **Muted Indigo Surface (`#EEF2FF` / Border: `#E0E7FF`)**: Tonal accent container for informational banners, callouts, and highlighted step trackers.
- **Typography - Dark Slate (`#0F172A`)**: High-contrast headline text ensures immediate readability across all ambient lighting conditions.
- **Typography - Muted Slate (`#64748B`)**: Secondary labels, helper instructions, and placeholder values.
- **Borders & Dividers (`#E2E8F0`)**: Hairline outlines defining container perimeters and table cell rows without adding visual weight.

## Typography

The typography architecture uses a deliberate dual-font framework:

- **Plus Jakarta Sans** provides a clean, humanist geometric foundation for headings, onboarding instructions, action labels, and standard form inputs. Its open letterforms prevent visual fatigue on compact mobile viewports.
- **JetBrains Mono** handles all technical data points: transactional currencies, store identifier handles, tax IDs, SKU counts, and verification badges. The monospaced figure alignment ensures numerical data scans effortlessly in structured onboarding summaries and balance verification cards.

## Layout & Spacing

The onboarding framework operates on an 8pt spatial grid (with a 4pt sub-grid for tight inline badges and micro-spacers).

- **Mobile Viewport (Base)**: Single-column stacked layout with `margin-mobile` (16px) left/right canvas padding. Primary form containers occupy full available width within bounds to maximize hit targets.
- **Breakpoints**:
  - `mobile` (< 640px): 4-column fluid layout with dynamic vertical step progression. Sticky bottom action bar for primary wizard controls.
  - `tablet` (640px - 1024px): 8-column fluid layout, `margin` (24px). Splits into a dual-column experience with contextual progress on the left and form input fields on the right.
  - `desktop` (> 1024px): 12-column layout max-width constrained to 720px for onboarding workflows to preserve focused data-entry ergonomics.

## Elevation & Depth

This system avoids heavy drop shadows in favor of crisp architectural layering:

1. **Base Surface**: The `#F8FAFC` slate canvas rests at ground level (`z-index: 0`).
2. **Cards & Groups**: Raised containers use pure `#FFFFFF` bounded by a 1px border of `#E2E8F0`, augmented by a subtle ambient diffusion: `0 1px 3px 0 rgba(15, 23, 42, 0.04), 0 1px 2px -1px rgba(15, 23, 42, 0.02)`.
3. **Interactive Modals & Action Drawers**: Elevated overlays use `0 10px 15px -3px rgba(15, 23, 42, 0.08), 0 4px 6px -4px rgba(15, 23, 42, 0.03)` with a solid `#E2E8F0` border.
4. **Focused / Selected Cards**: Layered containers transition their border to `#4F46E5` and introduce an outer halo of `0 0 0 1px #4F46E5, 0 1px 2px 0 rgba(79, 70, 229, 0.1)`.

## Shapes

The design system standardizes on a rounded structural language:

- **Primary Cards & Modals**: Fixed at `1rem` (16px) radius to soften data-dense interfaces and establish a welcoming onboarding touchpoint.
- **Form Inputs & Action Buttons**: Utilize `0.5rem` (8px) corner radius to ensure structural integrity and distinct separation from outer container cards.
- **Pill Elements**: Status chips, merchant category badges, and numerical verification pills use full circular radiuses (`9999px`).

## Components

### Buttons
- **Primary Action**: Background `#4F46E5`, text `#FFFFFF`, height 48px on mobile for optimal thumb reach. Full width inside form sheets. Hover/active states darken to `#4338CA`.
- **Secondary / Ghost Action**: Background transparent or `#FFFFFF`, border 1px solid `#E2E8F0`, text `#0F172A`. Active state fills with `#F8FAFC`.
- **Step Progress Trigger**: Sticky bottom-sheet container pinning the primary submission button with an integrated safe-area inset.

### Input Fields
- **Container**: 48px height, 1px solid `#E2E8F0` border, `#FFFFFF` background, `0.5rem` radius. Text rendered in `#0F172A`.
- **States**: Focused state applies a sharp `#4F46E5` border and 3px matching tint ring (`rgba(79, 70, 229, 0.12)`). Invalid input shifts to `#EF4444`.
- **Technical Inputs (IBAN, Routing, Tax ID)**: Text dynamically formatted in `JetBrains Mono` with spaced groupings.

### Cards & Onboarding Steps
- **Step Container**: Pure white card with 16px radius, padded with `1.25rem` internally. Features an outer 1px `#E2E8F0` border.
- **Active Step Card**: Marked by an inline badge using `#EEF2FF` background and `#4F46E5` label, accented with a 2px left border strip in Deep Indigo.

### Status Chips & Badges
- **Monetary / Code Badges**: Constructed with `JetBrains Mono` at `0.75rem`.
- **Verified / Success**: Emerald Teal `#0D9488` text against `#CCFBF1` background.
- **In-Review / Pending**: Dark Slate `#0F172A` text against `#F1F5F9` background.

### Selection Tiles (Radio & Checkbox Cards)
- Selectable store types, payout structures, or business models use full-width card tiles.
- Inactive: 1px `#E2E8F0` border, white fill.
- Selected: 1.5px `#4F46E5` border, `#EEF2FF` soft wash background, with an Emerald Teal checkmark icon displayed in the upper-right corner.